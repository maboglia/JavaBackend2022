const titolo = document.getElementById('titolo');
const regione = document.getElementById('regione');
const bottone = document.getElementById('btnIndovina');
const output = document.getElementById('result');
const SX = document.getElementById('sinistra');
const DX = document.getElementById('destra');


bottone.onclick = function () { 

   let nomeRegione = regione.value;

   if (document.getElementById('lista') != null)
    document.getElementById('lista').remove();

   fetch('https://restcountries.com/v3.1/region/' + nomeRegione)
   .then(json => json.json())
   .then(js => {

       const UL = document.createElement('ul')
       UL.setAttribute('id', 'lista');
       for (const paese of js) {
           
           
           const LI = document.createElement('li')
           LI.textContent = paese.name.official
           
           LI.onclick = function () { 
               scopri(paese);
            }
           
           UL.appendChild(LI)


          
       }
       
       SX.appendChild(UL)

   })




}


function scopri(country) {
    
    titolo.textContent = country.name.official;

    let capital = '<h2>' + country.capital + '</h2>';
    let popolazione = '<h3>' + country.population + '</h3>';

    const IMG = document.createElement('img')

    IMG.setAttribute('src', country.flags.png)

    output.innerHTML = capital + popolazione;

    output.appendChild(IMG);

    console.log(country.name.official);
    console.log(country.capital);
    console.log(country.population);
    console.log(country.flags.png);

    const button = document.createElement('button');

    button.textContent = "Aggiungi al DB";

    button.onclick = function () { 

        const URL = 'http://localhost:9098/api';

        const datiPaese = {
            id : 0,
            bandiera: country.flags.png,
            capitale: country.capital[0],
            nome: country.name.official,
            popolazione: country.population,
        };

        console.log(datiPaese);

        fetch(URL, {
        method: 'POST', // or 'PUT'
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(datiPaese),
    })
    .then(response => response.json())
    .then(data => {
    console.log('Success:', data);
    })
    .catch((error) => {
    console.error('Error:', error);
    });







     }

    output.appendChild(button);

}




// var numeroSegreto = Math.round(Math.random()*100) +1;

// bottone.onclick = function () {

//     const Paragrafo = document.createElement('p');
//     Paragrafo.textContent = 'creato al volo';
//     output.appendChild(Paragrafo);


//     var sceltaUtente = numero.value;
//     var numeroScelto = parseInt(sceltaUtente);
    
// console.log(sceltaUtente);
// console.log(numeroSegreto);


//     // if (numeroScelto > numeroSegreto){
//     //     output.textContent = 'Troppo grande. prova ancora';
//     // }
//     // else if (numeroScelto < numeroSegreto){
//     //     output.textContent = 'Troppo piccolo. prova ancora';

//     // }
//     // else {
//     //     output.textContent = 'Perfetto!!!!';
//     // }


// }

// // for (let index = 0; index < 10; index++) {
// //     alert();
    
// // }


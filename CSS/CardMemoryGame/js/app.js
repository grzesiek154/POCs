'use strict';
import { cardBackground } from 'app/data.js'

let card = document.querySelector('.card');
const cardsList = document.querySelector('.flex-container');



function cardFlip(e) {
    
    if (e.target.parentElement.classList.contains('card')) {
        e.target.parentElement.classList.toggle('flip');
    }
}





//document.body.addEventListener('click', cardFlip);


function checkCardMatch(element){

    e.target.parentElement.classList.add('selected');
    
    if(e.target.parentElement.classList.contains()) {

    }
}

cardsList.addEventListener('click', function(){
    cardFlip();
    console.log(cardBackground);

});




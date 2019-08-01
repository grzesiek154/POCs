
import ImageManager from '/js/ImageManager.js'

let card = document.querySelector('.card');
const cardsList = document.querySelector('.flex-container');



function cardFlip(e) {
    
    if (e.target.parentElement.classList.contains('card')) {
        e.target.parentElement.classList.toggle('flip');
    }
}

cardsList.addEventListener('click', e =>{
    cardFlip(e);
    //console.log(cardBackground);

});

const im = new ImageManager();

im.test();

im.setRandomImage();



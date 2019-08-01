export default class ImageManager {

    test() {
        const cards = document.querySelectorAll('.card-front');
        console.log(cards);
    }
    getRandomVal(min, max) {
        min = Math.ceil(min);
        max = Math.floor(max);
        let val = Math.floor(Math.random() * (max - min)) + min;  
        let count = 0;
        let temp;
        if (temp == val) {
            count++;
            if(count == 2) {
                
            }
        }
        return val;    
    }


    setRandomImage(val) {

        const cards = document.querySelectorAll('.card-front');
        const cardImgaes = [
        "img/icon1.png",
        "img/icon2.png",
        "img/icon3.png",
        "img/icon4.png",
        "img/icon5.png",
        "img/icon6.png"
        ];

        for (let i = 0; i < cards.length; i++) {
            val = this.getRandomVal(0,6);
            cards[i].style.backgroundImage = `url(${cardImgaes[val]})`;
            // cards.forEach(el =>{
            // el.style.backgroundImage = `url(${cardImgaes[val]})`;
            // });
           
            console.log(val);
        }
    }
  
}




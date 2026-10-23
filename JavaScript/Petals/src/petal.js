class Petal {

    isInLove(flowerOne, flowerTwo) {
        if (flowerOne % 2 === 0 && flowerTwo % 2 !== 0 || flowerTwo % 2 === 0 && flowerOne !== 2) {
            return true;
        } else {
            return false;
        }
    }

}




module.exports = {Petals}
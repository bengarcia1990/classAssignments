var slideshow = {
    photoList: [
        "smile",
        "wave",
        "mount rushmore",
        "grand canyon"
    ],
    currentPhotoIndex: 0,
    nextPhoto() {
        if (this.currentPhotoIndex === this.photoList.length) {
            console.log("end of slideshow");
            this.pause();
        }
        else {
            console.log(this.photoList[this.currentPhotoIndex]);
            this.currentPhotoIndex++;
        }
    },
    previousPhoto() {
        if (this.currentPhotoIndex === 0) {
            console.log("beginning of slideshow");
        }
        else {
            console.log(this.photoList[this.currentPhotoIndex]);
            this.currentPhotoIndex--;
        }
    },
    getCurrentPhoto() {
        console.log(this.photoList[this.currentPhotoIndex]);
    },

    playInterval: 0,

    play: function () {
        this.playInterval = setInterval(this.nextPhoto.bind(this), 2000);
    },

    pause: function () {
        clearInterval(this.playInterval)
    }

}

function getcurrentPhoto() {
    return slideshow.play();
}

getcurrentPhoto();
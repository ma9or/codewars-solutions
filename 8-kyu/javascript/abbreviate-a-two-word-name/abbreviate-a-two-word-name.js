function abbrevName(name){
    const array = name.split(" ");
    const firstName = array[0];
    const secoderName = array[1];
​
        return firstName[0].toUpperCase() + "." + secoderName[0].toUpperCase()
};
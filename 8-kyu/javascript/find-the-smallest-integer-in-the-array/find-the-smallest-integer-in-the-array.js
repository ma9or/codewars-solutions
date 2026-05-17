function findSmallestInt(arr) {
    let num = Infinity;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] < num) {
            num = arr[i];
        }
    }
    return num;
}
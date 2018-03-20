function solve(arr){
    let lengthOfArray = Number(arr[0]);
    let array = []; // or let array = new Array(n).fill(0);
    for (let i = 0; i < lengthOfArray; i++){
        array.push(0);
    }

    for (let i = 1; i < arr.length; i++){ //zapochva ot 1, zashtoto 0 e za goleminata na otgovorut masiv
        let currentNumbers = arr[i].split(' - ');
        let index = Number(currentNumbers[0]);
        let newValue = Number(currentNumbers[1]);
        array[index] = newValue;
    }

    for (item of array){
        console.log(item);
    }
}

// solve(['5', '0 - 3', '3 - -1', '4 - 2']);
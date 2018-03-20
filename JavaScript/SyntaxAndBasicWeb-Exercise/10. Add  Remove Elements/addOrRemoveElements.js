function solve(arr){
    let array = [];

    for (let i = 0; i < arr.length; i++){
        let currentLine = arr[i].split(' ');
        let command = currentLine[0];
        let indexOrValue = Number(currentLine[1]); // value if command is add, index if command is remove
        if (command === 'add'){
            array.push(indexOrValue);
        } else if (command === 'remove'){
            if (indexOrValue < 0 || indexOrValue >= array.length){
                continue;
            } else {
                array.splice(indexOrValue, 1); // kakvo pravi splice?
            }
        }
    }

    for (item of array){
        console.log(item);
    }
}

// solve(['add 3', 'add 5', 'remove 1', 'add 2']);
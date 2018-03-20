function solve(arr){
    let key = arr[arr.length - 1];
    objects = {};

    for (let i = 0; i < arr.length - 1; i++){
        let currentLine = arr[i].split(' ');
        let currentKey = currentLine[0];
        let currentValue = currentLine[1];

        if (!(currentKey in objects)){ //ako nqma takuv kliuch
            let list = [];
            list.push(currentValue);
            objects[currentKey] = list;
        } else {
            objects[currentKey].push(currentValue);
        }
    }

    if (!(key in objects)){
        console.log('None');
    } else {
        console.log(objects[key].join('\n'));
    }
}

// solve([
//     '3 test',
//     '3 test1',
//     '4 test2',
//     '4 test3',
//     '4 test5',
//     '4'
// ]);
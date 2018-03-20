function solve(arr) {
    let objects = {};
    let key = arr[arr.length - 1];
    for (let i = 0; i < arr.length - 1; i++) {
        let currentInfo = arr[i].split(' ');
        let currentKey = currentInfo[0];
        let currentValue = currentInfo[1];

        objects[currentKey] = currentValue;

    }
    if (key in objects){
        console.log(objects[key]);
    } else {
        console.log('None');
    }
}

// solve([
//     '3 bla',
//     '3 alb',
//     '2'
//
// ]);
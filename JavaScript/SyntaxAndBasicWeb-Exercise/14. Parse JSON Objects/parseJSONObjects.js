function solve(arr) {
    let people = []; // or let people = arr.map(i => JSON.parse(i));
    for (let i = 0; i < arr.length; i++) {
        people.push(JSON.parse(arr[i]));
    }

    for (let item of people) {
        console.log(`Name: ${item.name} \nAge: ${item.age} \nDate: ${item.date}`)
    }
}

// solve([
//     `{"name":"Gosho","age":10,"date":"19/06/2005"}`,
//     `{"name":"Tosho","age":11,"date":"04/04/2005"}`
// ]);
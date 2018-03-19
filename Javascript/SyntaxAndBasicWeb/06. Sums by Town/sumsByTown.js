function sumsByTown(input){
    input = input.map(token => JSON.parse(token)); // JSON.parse prevrushta string v obekt
    let towns = {}; // prazen obekt

    for (let item of input){
        if (towns[item.town] === undefined){
            towns[item.town] = 0;
        }
        towns[item.town] += item.income;
    }

    let townNames = Object.keys(towns);
    townNames = townNames.sort();
    for (let townName of townNames){
        console.log(`${townName} -> ${towns[townName]}`)
    }

    // if (item.town in towns){ // analogichno na "if Dictionary.ContainsKey(key)", ne stava samo "if (item in towns)"
    //     console.log("towns contains a key, named item.town");
    // }
}

// sumsByTown(['{"town":"Sofia","income":200}',
// '{"town":"Varna","income":120}',
// '{"town":"Pleven","income":60}',
// '{"town":"Varna","income":70}']
// );
function solve(arr) {
    arr = arr.map(s => s.split(' -> '));
    let student = {};
    student.name = arr[0][1];
    student.surname = arr[1][1];
    student.age = Number(arr[2][1]);
    student.grade = Number(arr[3][1]);
    student.date = arr[4][1];
    student.town = arr[5][1];
    console.log(JSON.stringify(student));
}

// solve([
//     `name -> Angel`,
//     `surname -> Georgiev`,
//     `age -> 20`,
//     `grade -> 6.00`,
//     `date -> 23/05/1995`,
//     `town -> Sofia`
// ]);

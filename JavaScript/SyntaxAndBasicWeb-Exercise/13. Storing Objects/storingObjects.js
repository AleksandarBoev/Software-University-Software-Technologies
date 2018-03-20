function solve(arr) {
    let students = [];
    for (let i = 0; i < arr.length; i++) {
        let currentLine = arr[i].split(' -> ');
        let name = currentLine[0];
        let age = currentLine[1];
        let grade = currentLine[2];
        let currentStudent = {"name":name,"age":age, "grade":grade};
        students.push(currentStudent);
        /* vtoro reshenie:
        let student = {};
        student.name = name;
        student.age = age;
        student.grade = Number(grade); -> pri printiraneto za da ima pone 2 cifri sled desetichnata zapetaq chrez student.grade.toFixed(2)
        */
    }

    for (item of students){
        console.log(`Name: ${item.name} \nAge: ${item.age} \nGrade: ${item.grade}`)
    }
}

// solve([
//     'Pesho -> 13 -> 6.00',
//     'Ivan -> 12 -> 5.57',
//     'Toni -> 13 -> 4.90'
// ]);
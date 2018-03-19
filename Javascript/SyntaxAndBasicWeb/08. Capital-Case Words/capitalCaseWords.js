function extractCapitalCaseWords(input){
    function isCapitalCaseWord(word){
        return word === word.toUpperCase();
    }
    let words = input.join(',');
    words = words.split(/\W+/);
    words = words.filter(w => w.length > 0);
    words = words.filter(w => isCapitalCaseWord(w));
    console.log(words.join(', '));


}



// extractCapitalCaseWords(["We start by HTML, CSS, JavaScript, JSON and REST.\n" +
//     "Later we touch some PHP, MySQL and SQL.\n" +
//     "Later we play with C#, EF, SQL Server and ASP.NET MVC.\n" +
//     "Finally, we touch some Java, Hibernate and Spring.MVC.\n"]);
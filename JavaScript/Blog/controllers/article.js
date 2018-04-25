const Article = require('../models').Article; // unresolved variable

module.exports = { // vsqko edno e obekt
    createGet: (req, res) => { // ima dve tochki kato za obekt
        res.render('article/create');
    }, // zapetaikata e za da se izbroqvat tezi obekti

    createPost:(req, res) => {
        let articleArgs = req.body;

        let errorMsg = '';

        if (!req.isAuthenticated()) {
            errorMsg = 'You should be logged in to make articles, dude! Cmon';
        } else if (!articleArgs.title) { // v javaScipt prazen string se schita za false
            errorMsg = 'Invalid title! Put something in there, man.';
        } else if (!articleArgs.content) {
            errorMsg = 'Invalid content! This is not a math test. Put something in there';
        }

        if (errorMsg) { //otnovo, ako stringut ne e prazen, t.e. ima error, da se izpulni neshto
            res.render('article/create', {error:errorMsg});
            return; // dolniq kod nqma da se izpulni
        }
        articleArgs.authorId = req.user.id;

        Article.create(articleArgs).then(article => {
            res.redirect('/');
        }).catch(err => {
            console.log(err.message);
            res.render('article/create', {error: err.message});
        });
    },

    //dunno if this thing should be written here:
    details: (req, res) => {
        let id = req.params.id;

        Article.findById(id, {include: [ // obekt v obekta?
                {
                    model: User
                }
            ]
        }).then(article => {
            res.render('article/details', article.dataValues)
        });
    }
};
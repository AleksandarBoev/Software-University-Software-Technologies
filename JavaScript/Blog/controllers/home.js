const Article = require('../models').Article;
const User = require('./../models').User;

module.exports = { // ne znam dali stupkata predi 2.Details Articles se pishe tuk
    index: (req, res) => {
        Article.findAll({ limit: 6, include: [{
            model:User
            }]}).then(articles => {
                res.render('home/index', {articles: articles});
        });
        // res.render('home/index');
    }
};





const userController = require('../controllers').user; // ima razminavane s fail-a
const homeController = require('./../controllers').home; // ima razminavane s fail-a (predi VI.Read Articles)
const articleController = require('../controllers').article; // unresolved variable article -->  changed things in index.js

module.exports = (app) =>{
    app.get('/', homeController.index);

    app.get('/user/register', userController.registerGet);
    app.post('/user/register', userController.registerPost);
    app.get('/user/login',userController.loginGet);
    app.post('/user/login',userController.loginPost);

    app.get('/user/logout',userController.logout);

    // app.get('/user/details', userController.) // this should be added, but I have no idea how to do it...

    app.get('/article/create', articleController.createGet);
    app.post('/article/create', articleController.createPost);

    app.get('/article/details/:id', articleController.details);
};

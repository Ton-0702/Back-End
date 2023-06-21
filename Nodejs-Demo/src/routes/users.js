const express = require('express');
const router = express.Router()
const userController = require('../controllers/users')

router.get('/users', userController.getAllUsers)
// find user by id
router.get('/users/:userId', userController.getUserById);

// find user by name and age
router.get('/users-by-name-age', userController.getUserByNameAndAge);

// create user
router.post('/users', userController.createUser);

// // create many users
// router.post('/createManyUsers', userController.createManyUsers);
module.exports = router;

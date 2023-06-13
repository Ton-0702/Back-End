const express = require('express');
const router = express.Router()
const userController = require('../controllers/users')

router.get('/get-all-users', userController.getAllUsers)
// find user by id
router.get('/getUser/:userId', userController.getUserById);

// find user by name and age
router.get('/getUserByNameAndAge', userController.getUserByNameAndAge);

// create user
router.post('/createUser', userController.createUser);

// create many users
router.post('/createManyUsers', userController.createManyUsers);
module.exports = router;

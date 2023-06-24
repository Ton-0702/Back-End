const express = require('express')
const router = express.Router()
const createRandomStringController = require('../controller/7_createRandomString')

router.get('/random-string/:number', createRandomStringController.createRandomString)

module.exports = router;
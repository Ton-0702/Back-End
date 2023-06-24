const express = require('express');
const router = express.Router();
const factorialController = require('../controller/8_factorial')

router.get('/factorial/:int', factorialController.factorial)

module.exports = router;
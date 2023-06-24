const express = require('express');
const router = express.Router();
const fizzController = require('../controller/fizz')
router.get('/fizz/:int', fizzController.fizzDivide)

module.exports = router;
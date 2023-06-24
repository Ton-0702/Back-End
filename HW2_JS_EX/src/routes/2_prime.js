const express = require('express');
const router = express.Router();
const sntController = require('../controller/2_prime')

router.get('/checkprime/:number', sntController.checkPrime);

module.exports = router;
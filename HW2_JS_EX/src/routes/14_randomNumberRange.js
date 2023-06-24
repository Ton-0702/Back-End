const express = require('express');
const router = express.Router();
const randomNumberRangeController = require("../controller/14_randomNumberRange");

router.get('/random-range-number', randomNumberRangeController.randomNumber)

module.exports = router;
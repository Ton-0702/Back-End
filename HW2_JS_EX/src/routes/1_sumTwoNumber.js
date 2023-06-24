const express = require('express');
const router =  express.Router()
const sumTwoNumberController = require('../controller/1_sumTwoNumber')

router.get('/sum-number', sumTwoNumberController.sumNumber)

module.exports = router;
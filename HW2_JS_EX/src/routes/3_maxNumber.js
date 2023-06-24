const express = require('express');
const router = express.Router();
const maxNumberController = require('../controller/3_maxNumber')

router.post('/max-number', maxNumberController.checkMaxNumberArray);

module.exports = router;
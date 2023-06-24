const express = require('express');
const router = express.Router();
const reverseStringController = require('../controller/4_reverseString')

router.get('/reverse-string/:string', reverseStringController.reverse)

module.exports = router;
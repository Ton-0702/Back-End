const express = require('express');
const router = express.Router();
const perfectNumberController = require("../controller/15_perfectNumber");

router.get('/perfect-number/:int', perfectNumberController.checkPerfectNumber)

module.exports = router;
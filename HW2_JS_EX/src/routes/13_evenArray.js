const express = require('express');
const router = express.Router();
const evenArrayController = require("../controller/13_evenArray");

router.get('/even-array', evenArrayController.even)

module.exports = router;
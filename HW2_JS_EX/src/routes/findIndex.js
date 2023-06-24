const express = require('express')
const router = express.Router()
const findIndexController = require('../controller/findIndex')

router.get('/findindex-string', findIndexController.findIndex)

module.exports = router;
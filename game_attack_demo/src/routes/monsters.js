const express = require('express');
const router = express.Router();
const monsterController = require('../controller/monsters')
const uniqueMiddleware = require('../middleware/uniqueMiddleware')
const { monsters} = require('../database')

// Monster
router.get('/monsters', monsterController.getAllMonters);

router.get('/monster/:name', monsterController.getMonsterName);

router.post('/monster', uniqueMiddleware.uniqueName(monsters), monsterController.createMonster);

router.delete('/monster/:name', monsterController.deleteMonsterName);

module.exports = router;
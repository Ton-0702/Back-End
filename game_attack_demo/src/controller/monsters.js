// import { players } from "../routes/attack";
const { monsters} = require('../database')

function getAllMonters(req, res) {
    res.send(
        monsters
    )
};

function getMonsterName(req, res){
    const nameMonster = req.params.name;
    console.log("nameMonster: ", nameMonster);
    monsters.forEach((element) => {
        if (element.name === nameMonster){
            res.send(
                element
            )
        };
    });
};

function createMonster(req, res){
    const {name, attack, health} = req.body;
    // console.log(newMonsters);
    monsters.push(
        {
            name,
            attack,
            health,
            status: health > 0 ? 'alive' : 'death',
        }
    );
    
    res.json(monsters)
    // res.send(
    //     monsters
    // )
}

function deleteMonsterName(req,res) {
    console.log(req.body);
    res.send(
        req.body
    )
}


module.exports = {
    getAllMonters,
    getMonsterName,
    createMonster,
    deleteMonsterName
}
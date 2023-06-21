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
    // monsters.forEach((element) => {
    //     if (element.name === nameMonster){
    //         res.send(
    //             element
    //         )
    //     };
    // });

    // Cach 1:
    // for (const monster of monsters){
    //     if(monster.name === nameMonster){
    //         res.json(monster)
    //     }
    // }
    // next(`Monster with name: ${nameMonster} does not exist`)

    // Cach 2:
    const monster = monsters.find(m => m.name === nameMonster)
    if(!monster) {
        next(`Monster with name: ${name} does not exist`);
    }
    res.json(monster);
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
    const nameMonster  = req.params.name;
    console.log(nameMonster);
    const position = monsters.findIndex(m => m.name === nameMonster);
    if (position <0){
        res.status(204).json({})
    }
    monsters.splice(position,1)
    res.json(monsters)
}


module.exports = {
    getAllMonters,
    getMonsterName,
    createMonster,
    deleteMonsterName
}
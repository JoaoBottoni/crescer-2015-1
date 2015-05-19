//Exercício 1

var chelsea = {
  nome: 'Chelsea Football Club',
  titulos: [
    { desc: 'Nacionais', qtd: 5 },
    { desc: 'Continentais', qtd: 1 },
    { desc: 'Mundiais', qtd: 0 }
  ]
};
var arsenal = {
  nome: 'Arsenal Football Club',
  titulos: [
    { desc: 'Nacionais', qtd: 13 },
    { desc: 'Continentais', qtd: 0 },
    { desc: 'Mundiais', qtd: 0 }
  ]
};
var liverpool = {
  nome: 'Liverpool Football Club',
  titulos: [
    { desc: 'Nacionais', qtd: 18 },
    { desc: 'Continentais', qtd: 5 },
    { desc: 'Mundiais', qtd: 0 }
  ]
};
var manchester = {
  nome: 'Manchester United Football Club',
  titulos: [
    { desc: 'Nacionais', qtd: 20 },
    { desc: 'Continentais', qtd: 3 },
    { desc: 'Mundiais', qtd: 2 }
  ]
};

var PrincipaisClubesIngleses = [chelsea, arsenal, liverpool, manchester]

//Exercício 2

function ordenaPorNacionais(array) {
  function compare1(a,b) {
    if (a.titulos[0].qtd > b.titulos[0].qtd)
      return -1;
    if (a.titulos[0].qtd < b.titulos[0].qtd)
      return 1;
    return 0;
  }
  return array.sort(compare1);};
  
function ordenaPorContinentais(array) {
  function compare2(a,b) {
    if (a.titulos[1].qtd > b.titulos[1].qtd)
      return -1;
    if (a.titulos[1].qtd < b.titulos[1].qtd)
      return 1;
    return 0;
  }
  return array.sort(compare2);};
  
function ordenaPorMundiais(array) {
  function compare3(a,b) {
    if (a.titulos[2].qtd > b.titulos[2].qtd)
      return -1;
    if (a.titulos[2].qtd < b.titulos[2].qtd)
      return 1;
    return 0;
  }
  return array.sort(compare3);};
  
//Exercício 3

function somarPorNacionais(Array){
  
  return Array.map(function(i){
    return i.titulos[0].qtd;
  })
  .reduce(function(a,b){
    return a+b;
  });
  
};

function somarPorContinentais(Array){
  
  return Array.map(function(i){
    return i.titulos[1].qtd;
  })
  .reduce(function(a,b){
    return a+b;
  });
  
};

function somarPorMundiais(Array){
  
  return Array.map(function(i){
    return i.titulos[2].qtd;
  })
  .reduce(function(a,b){
    return a+b;
  });
  
};

//Exercício 4

function ApenasOsMelhores(Arraii){
  var aux = new Array;
  Arraii.map(function(i){
    if(i.titulos[0].qtd>18)
      aux.push(i);
  })
  return aux; 
};

//Exercício 5

function ApenasOsMelhoresParaJSON(Arraii){
  return JSON.stringify(apenasOsMelhores(Arraii));
};

function ApenasOsMelhoresRecebendoJSON(string){
  return JSON.parse(string);
};
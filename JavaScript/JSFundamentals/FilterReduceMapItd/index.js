const companies= [
    {name: "Company One", category: "Finance", start: 1981, end: 2004},
    {name: "Company Two", category: "Retail", start: 1992, end: 2008},
    {name: "Company Three", category: "Auto", start: 1999, end: 2007},
    {name: "Company Four", category: "Retail", start: 1989, end: 2010},
    {name: "Company Five", category: "Technology", start: 2009, end: 2014},
    {name: "Company Six", category: "Finance", start: 1987, end: 2010},
    {name: "Company Seven", category: "Auto", start: 1986, end: 1996},
    {name: "Company Eight", category: "Technology", start: 2011, end: 2016},
    {name: "Company Nine", category: "Retail", start: 1981, end: 1989}
  ];
  
  const ages = [33, 12, 20, 16, 5, 54, 21, 44, 61, 13, 15, 45, 25, 64, 32];


//   for(let i = 0; i < companies.length; i++) {

//       console.log(companies[i]);
//   }

  // forEach
  
  // companies.forEach(function(company) {
  //   console.log(company.name);
  // });

  //filter
  //The filter() method creates a new array with all elements that pass the test implemented by the provided function.
  //Get 21 and older
  
//   let canDrink = [];
//   for(let i = 0; i < ages.length; i++) {
//     if(ages[i] >= 21) {
//       canDrink.push(ages[i]);
//     }
//   }

//get age 21
// const candDring = ages.filter(function(age) {
//     if (age >= 21) {
//         return true;
//     }
// });

// const canDrink = ages.filter(age => age >= 21);
//console.log(canDrink);


  // Filter retail companies
  
  // const retailCompanies = companies.filter(function(company) {
  //   if(company.category === 'Retail') {
  //     return true;
  //   }
  // });

 
      
  const retailCompanies = companies.filter(company => company.category === 'Retail');
  
  // Get 80s companies
  
  const eightiesCompanies = companies.filter(company => (company.start >= 1980 && company.start < 1990));
  
  // Get companies that lasted 10 years or more
  
  const lastedTenYears = companies.filter(company => (company.end - company.start >= 10));


// map
//The map() method creates a new array with the results of calling a provided function on every element in the calling array.

// create array of company names
// const companyNames = companies.map(function(company) {
//     return company.name;
// });

// const testMap = companies.map(function(company) {
//     return `${company.name} [${company.start} - ${company.end}]`;
// });

const testMap = companies.map(company => 
     `${company.name} [${company.start} - ${company.end}]`
);

const agesSquere = ages.map(age => Math.sqrt(age));

const ageMap = ages
    .map(age => Math.sqrt(age))
    .map(age => age * 2);

console.log(testMap);
console.log(ageMap);


// sort
//The sort() method sorts the elements of an array in place and returns the sorted array. The default sort order is built upon converting the elements into strings, then comparing their sequences of UTF-16 code units values.
//The time and space complexity of the sort cannot be guaranteed as it depends on the implementation.
// const sortedCompanies = companies.sort(function(c1, c2) {
//     if(c1.start > c2.start) {
//         return 1;
//     } else {
//         return -1;
//     }
// });

const sortedCompanies = companies.sort((a,b) => (a.start > b.start ? 1 : -1));
const sortAges = ages.sort((a,b) => a-b);

console.log(sortedCompanies);
console.log(sortAges);


 // reduce
 //The reduce() method executes a reducer function (that you provide) on each element of the array, resulting in a single output value.
 //The reducer function takes four arguments:

//  Accumulator (acc)
//  Current Value (cur)
//  Current Index (idx)
//  Source Array (src)
//  Your reducer function's returned value is assigned to the accumulator, 
//whose value is remembered across each iteration throughout the array and ultimately becomes the final, single resulting value.
  
// let ageSum = 0;
  // for(let i = 0; i < ages.length; i++) {
  //   ageSum += ages[i];
  // }

// const ageSum = ages.reduce(function(total, age){
//     return total + age;
// },0);

const ageSum = ages.reduce((total, age) => total + age, 0);

// const totaYears = companies.reduce(function(total, company) {
//     return total + (company.end - company.start);
// },0);

const totaYears = companies.reduce((total, company) =>
    total + (company.end - company.start),0);


// combine all together


const combined = ages
    .map(age => age *2)
    .filter(age => age >= 40)
    .sort((a,b) => a - b)
    .reduce((a,b) => a + b, 0);

console.log(combined);
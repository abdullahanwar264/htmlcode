// console.log('apna clg');
// console.log('ABDULLAH ANWAR');
// console.log("ALL");
// fullname = "abdullah anwar";
// console.log(fullname);
// AGE =21;
// console.log(AGE);
// PRICE = 20.21
// console.log(PRICE);
// a=null;
// console.log(a);
// z= undefined;
// console.log(z);
// isfollow = false
// isfollow = true
// console.log(isfollow);
// fullname = 444;
// console.log(fullname);


// // practice set 1 of JS :-

// // Q.1) :-

// let a = "string" ;
// let b = 23 ;
// console.log(a+b);


// // Q.2) :-

// console.log(typeof (a+b));

// // Q.3) :-

// const a1 = {
//     people: "abdullah",
//     Class: "12th",
//     isok : true,
//     happy : undefined,

// }
// console.log(a1)

// //Q.4)

// //  a1 = 22;   error
// //a1 = {new object}  error
// a1 ["name"] = "shubham";  // add another key by this technique
// a1 ["school"] = "all saints'";

// console.log(a1)


// const wordmeaning ={
//     bat : "object",
//     ball : "object",
//     mango : "fruit",
//     carrot : "vegitable",
//     cocacola : "drink",
// }

// console.log(wordmeaning.ball)
// console.log(wordmeaning["mango"])




//JS OPERATORS :-

// let e = 43;
// let f = 4 ;

// // ARTHEMATIC OPERATORS :-

// console.log("e + f = ", e+f );
// console.log("e - f = ", e-f );
// console.log("e * f = ", e*f );
// console.log("e / f = ", e/f );
// console.log("e % f = ", e%f)
// console.log("e++ = ", e++ );
// console.log("f-- = ", f-- );
// console.log(e)
// console.log(f)
// console.log("++f = ",++f)



// ASSINGMENT OPERATORS :-
//  let assignment = 1

//  assignment += 5 
//  assignment -=2
//  assignment **=2
//  assignment /=3
//  assignment %=2
//  assignment **=2
//  console.log(assignment)


//  COMPARISION OPERATORS :-

// let t = 2;
// console.log(t ==="2")
// console.log(t == 2)
// console.log(t <=1)
// console.log(t >=1)
// console.log(t !=4)
// console.log(t <11) 
// console.log(t >42)


// LOGICAL OPERATOR

let x = 5 ;
let y = 4 ;
console.log(x>y && x!=y)   //[AGR DONO MAI SE EK CONDITION BHI FALSE HO GAI TO ANS BHI FALSE AYEGA]

console.log(x==y || x ==y)  //[AGR DONO MAI SE EK CONDITION BHI true HO GAI TO ANS BHI true AYEGA]

console.log(!false)   


// CONDITIONAL STATEMENTS


// let a = prompt("enter your age ");  //[questioning notification on browser]


// if (a < 9) {

//     alert("you are a kid you cannot even think of driving");  //[notification]
// }
// else if(a <18 && a>9){

//     alert("you are a kid you can think of driving after 18");
// }

// else{

//     alert("you can drive as you are above 18");
// }



// console.log("done");



// JS TERNORY OPERATOR :-

// console.log(a>=18?  "yes drive" : "can't drive" )




// PRACTICE SET 2 JS :-

// //Q.1)

// let r = prompt("what is your age")

// if (r>=10 && r<=20){
//     console.log("true")
// }
// console.log("false")

// Q.2) :-

let r = prompt("enter your age")

switch (r) {

    case '12': 
    console.log("your age is 12")
    break
    case '13': 
    console.log("your age is 13")
    break
    case '14': 
    console.log("your age is 14")
    break
    case '15': 
    console.log("your age is 15")
    break
    case '16': 
    console.log("your age is 16")
    break

    default:
    console.log("your age is special")
    break
}


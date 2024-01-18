var a;     // DECLARATION 
//-----------------------------------------------------------------------------
//word & constent
//----------------------------------------------------------------------------- 
//var , const & let  
//-----------------------------------------------------------------------------

//hosting ||| BIG DIFFERNCE ||| hoisting

//-----------------------------------------------------------------------------

//HOISTING - variable and functions are hoisted which means
        //there declaration is moved on the top of the Code.

//example :-

    //POV OF PROGRAMMER:-
var b = 12;

console.log(a);          // undefined

//console.log(achaaar)   //not defined 

    //POV OF JS :-


a = 12;                 // INITIALIZATION


//---------------------------------------------------------------------------

// TYPES IN JS :-
// primitives & reference :-

// ese koi bhi value jisko copy karne pr real copy nhi hota,
// balki us main value ka refrense pass ho jata hai, 
// use ham refrence value kehte hai, aur jiske copy karne or real copy ho jaaye 
// wo value primitive type hoti hai.

// Reference = () {} [] :-

// example :-

var x = [1,2,3,4];   //X ke pass hai khudka 1,2,3,4
var y = a;          //but Y ke pass hai X ka 1,2,3,4  ==>this is called refrence




// primitive = wo value jisme brackits nhi hain. (brackits)X 

// example :-

var w = "avsdvf";

//----------------------------------------------------------------------

// CONDITIONALS- IF ELSE , ELSE IF :-

// jab bat agr mgr pr aajaye , ya fir baat aaygi 
// aisa hua to ye karo , wesa hua to wo karo 

//----------------------------------------------------------------------

// LOOPS- for , while :-


// for loop example :-

for (i=0; i<=40; i++ )
{
    console.log(i)
}


// while loop example :-

var q = 12;

while (q<=33) {
    q++;
    console.log(q)
}

//-------------------------------------------------------------------------

// FUNCTIONS :-

// [mainly teen(3) kaam ke liye use hota hai]

// 1) jab aap code turant nhi chalana chahte future main chalana chahte ho.
// 2) jab aapke code aap reuse karna chahte ho.
// 3) jab aap code chalana chahte ho hr baar with different data.


// example (for point - 1,2):-

function abc() {
    console.log("chai")
}

abc() 

// example (for point - 3) :-

// [ In this type of function we use (PARAMETERS , ARGUMENTS) ]

// ARGUMENTS = real values jo hum dete hai functions chalate waqt.
// PARAMETERS = variables jinme values store hote hai arguments wali.


function any(a,s,d,f,g) {

    console.log(a,s,d,f,g);    
}

any(12,13,14,15);


//-------------------------------------------------------------------------

// ARRAYS = group of elements :-

//--> hum ek variable mai ek value store kr paate hai pr jab humein ek se
//ziyada values store karna hoti hai ek hi variable mai tab hum ARRAY ka 
//use krte hain , matlab ki ARRAY aapko freedom deta hai ek se ziyada 
//value use karne ki.

// example :-

var arr = [1, 2, 3, 4, 5, 6];

// console.log(arr[1]);

// { FUNCTIONS IN ARRAY =  [PUSH , POP , SHIFT , UNSHIFT , SPLiCE] } :-

// arr.push(7);  // for a number in existing array.
// arr.pop();  // for removing single value from the existing array.
// arr.unshift();  // array ke shuru mai ek value add karne ke liye use hota hai. 
// arr.shift();   // array ke shuru mai se ek value hatane ke liye use hota hai.

arr.splice(3,3);  //array ke kisi perticular index ko hatane ke liye use hota hai.



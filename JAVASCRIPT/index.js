// console.log('hello js')

// let,const,var


// var vs let vs const

// var a=5
// var a=49
// console.log(a)

// let c=5
// c=20
// console.log(c)

// const b=4
// console.log(b)

//-------------------------------------------------------------

// // undefined and null

// let user 
// console.log(user)

// let User = null;
// console.log(User);

// if (true) {
//     console.log("yes")
// } else {
//     console.log("no")
// }

//-----------------------------------------------------------------

// // if else in js
// let isBool = 0;
// isBool?console.log("hello"):console.log("hii")

//--------------------------------------------------------------------

// // NONPREMITIVE


// function sum()
// {
//     console.log('abdullah')
// }

// sum()


// calling and constructing in js
// const Add=() => {
//     console.log("anwar")
// }

// Add()



// let number=[1,2,3,4,5,6,7]


// nunber of values in Array
// for(let i in number) {
//     console.log(i)
// }

// values as is it of array
// for (let i of number) {
//     console.log(i)
// }


// number.forEach((a,b,c) => {
//     console.log(a,b,c)
// });

// number.map((a,b,c) => {
//     console.log(a,b,c)
// } );


//------------------------------------------------------------------------


// EXICUTION CONTEST

// let member = 'abhi'

// console.log(user)



// function outer() 
// {
//     let num = 5

//     inner()
   
//     function inner() 
//     {
//         console.log(num)
//     }
// }
// outer()

//----------------------------------------------------------------

// hoisting :-


// var a                           =>    console.log(a)

// console.log(a)                        var a= 5

// a= 5



// let b 
                    
// console.log(b)

// b=5 


// function outer(){
//     console.log("hello")
// }

// outer()



// add ()
// var add=() => {
//     console.log()
// }


// add ()
// function add(){

// }

// let add= () => {
//     console.log()
// }
// add()


// let d = 5
// {
//     // var d = 11
//     let d = 10
//     console.log(d)
// }
// console.log(d)


//----------------------------------------------------------

// HIGHER ORDER FUCTION


// function outer(inner) {
//     console.log('hii')
//     inner()

//     return 5
// }

// outer(function inner(){
// connsole.log('heee')
// } )


// function outer() {
//     console.log('hiii')

//     function inner() 
//     {
//         console.log('ok')
//     }

//     return inner;

// }

// let a = outer()

// a()


//--------------------------------------------------------------

// var arr1=[1,2,3,4,5,'string' , 'hello' , true , false]

// function getString(arr1){

//     let res=[]
//     for(let item of arr1){
//         if(typeof item == 'string')
//         {
//             res.push(item)
//         }
//     }
//     return res
// }

// console.log(getString(arr1))
// console.log(getNumber(arr1))


// function getString(arr1){

//     let res=[]
//     for(let item of arr1){
//         if(typeof item == 'number')
//         {
//             res.push(item)
//         }
//     }
//     return res
// }



// function getString(item)
// {
//     return typeof item =='string'
// }

// function getNumber(item)
// {
//     return typeof item =='number'
// }

// function getboolean(item)
// {
//     return typeof item =='boolean'
// }


// function get(arr1, fn){
//     let res = []
//     for (let item of arr1){
//         if(fn(item)){
//             res.push(item)
//         }
//     }
//     return res
// }



// console.log(getString(arr1))
// console.log(getNumber(arr1))

//---------------------------------------------------------------

// //CLOSER :-

// function outer() 
// {
//     let user = 'yehi ayega'

//     function inner() 
//     {
//         console.log(user)
//     }
//     //inner()
//     return inner
// }

// let a = outer ()
// a()

// ---------------------------------------------------------

// PROTOTYPES :-


let obj ={
    id :1,
    user : "abdullah",
    print:function(){
        console.log(this.user)
    }
}
// obj.print()
console.log(obj.toString())


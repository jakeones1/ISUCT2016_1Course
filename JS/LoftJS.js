function filter(source) {
     let result = [];
     for (let i = 0; i < source.length; i++) {
     	if (source[i] > 5){
     		result.push.(source[i]);
     	}
     	
     }
   return result;

}

let array = [1, 10, -2, 46];
let res = filter(array);
console.log(res);
/**
 * @param {number[]} fruits
 * @return {number}
 */
var totalFruit = function (fruits) {
  if (fruits.length === 0) return 0;
  if (fruits.length < 3) return fruits.length;
  // key is to find the first and second largest number of trees
  // we can only pick exactly one fruit from every tree

  // and trees picked must be consecutive as well
  let baskets = new Map();
  const BUCKET_LIMIT = 2;
  let prev = -1;
  let max = -1;
  // loop through each item in the array
  for (let i = 0; i < fruits.length; i++) {
    // start 'picking' the fruit (count number of same fruit in a row)
    console.log(baskets);
    8;
    if (baskets.has(fruits[i])) {
      baskets.set(fruits[i], baskets.get(fruits[i] + 1));
    } else {
      if (baskets.size == BUCKET_LIMIT - 1) {
        m;
        max = Math.max(
          max,
          Object.values(baskets).reduce((acc, val) => acc + val, 0)
        );
        console.log("prev = " + prev);
        console.log(Object.values(baskets).reduce((acc, val) => acc + val, 0));
        baskets.delete(prev);
        prev = baskets.keys()[0];
      }
      // encountered new tree

      baskets.set(fruits[i], 1);
      // throw away the first basket
    }
    // once a different type of fruit is encountered, save the intermediary result,
    // throw away the first basket of fruits and start picking the new fruit
  }
  return max;

  //and then decide which pair of two consecutive fruit type will return a maximized output based on the intermediary results
};
console.log(totalFruit([1, 2, 1]));

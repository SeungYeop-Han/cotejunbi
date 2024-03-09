let input = ['5 4', '1 2 3', '3 4 4', '1 4 1', '2 2 2'];

const N = Number(input[0].split(' ')[0]);
const M = Number(input[0].split(' ')[1]);

let bucket = new Array(N).fill(0);

for (let i = 1; i <= M; i++) {
  const a = input[i].split(' ')[0];
  const b = input[i].split(' ')[1];
  const c = input[i].split(' ')[2];

  bucket.forEach((element, index) => {
    if (index >= a - 1 && index <= b - 1) {
      bucket[index] = Number(c);
    }
  });
}

console.log(bucket);

const input = ['5 3', '1 2', '3 4', '1 3'];

const [n, m] = input[0].split(' ').map(Number);

let badChoice = Array.from(Array(n), () => Array(n).fill(false));

for (let i = 1; i <= m; i++) {
  const [x, y] = input[i].split(' ').map(Number);
  badChoice[x - 1][y - 1] = true;
  badChoice[y - 1][x - 1] = true;
}

let answer = 0;

for (let i = 0; i < n - 2; i++) {
  for (let j = i + 1; j < n - 1; j++) {
    if (badChoice[i][j]) continue;
    for (let k = j + 1; k < n; k++) {
      if (badChoice[k][j] || badChoice[i][k]) continue;
      answer++;
    }
  }
}
console.log(answer);

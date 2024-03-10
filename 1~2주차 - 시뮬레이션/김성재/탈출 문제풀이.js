const input = ['3 3', 'D.*', '...', '.S.'];

let answer = 0;
const [R, C] = input[0].split(' ').map((x) => Number(x));
const graph = input.slice(1).map((str) => str.split(''));
const visit = Array(R)
  .fill()
  .map((_) => Array(C).fill(0));

let D, S;
let water = [];

for (let i = 0; i < R; i++) {
  for (let j = 0; j < C; j++) {
    if (graph[i][j] === 'D') D = [i, j];
    if (graph[i][j] === 'S') S = [i, j];
    if (graph[i][j] === '*') water.push([i, j]);
  }
}

const dx = [0, 1, 0, -1];
const dy = [1, 0, -1, 0];

function spreadWater() {
  const spread = [];
  for (let [x, y] of water) {
    for (let i = 0; i < 4; i++) {
      const [nx, ny] = [x + dx[i], y + dy[i]];
      if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
      if (graph[nx][ny] === '.') {
        graph[nx][ny] = '*';
        spread.push([nx, ny]);
      }
    }
  }
  water.push(...spread);
}

function findGoal() {
  const queue = [];
  let time = 0;
  queue.push(S);
  visit[S[0]][S[1]] = 1;
  while (queue.length) {
    spreadWater();
    for (let cycle = 0; cycle < queue.length; cycle++) {
      const [x, y] = queue.shift();
      if (x === D[0] && y === D[1]) {
        answer = time;
        return;
      }

      for (let i = 0; i < 4; i++) {
        const [nx, ny] = [x + dx[i], y + dy[i]];
        if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
        if (graph[nx][ny] === '*' || graph[nx][ny] === 'X' || visit[nx][ny])
          continue;
        visit[nx][ny] = 1;
        time++;
        queue.push([nx, ny]);
      }
    }
  }
  return;
}

findGoal();

console.log(answer ?? 'KAKTUS');

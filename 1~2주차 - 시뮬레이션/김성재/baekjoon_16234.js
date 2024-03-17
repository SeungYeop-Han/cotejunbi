const input = ['2 20 50', '50 30', '20 40'];

const [N, L, R] = input[0].split(' ').map(Number);

let days = 0;

let citys = input.slice(1).map((line) => line.split(' ').map(Number));

let ans = 0;
const dx = [0, 0, 1, -1];
const dy = [1, -1, 0, 0];

while (true) {
  let flag = false;
  const visited = Array.from({ length: N }, () =>
    Array.from({ length: N }, () => false)
  );

  for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
      if (!visited[i][j]) {
        let queue = [[i, j]];
        let visitedRecord = [[i, j]];
        let cnt = 1;
        let sumPopulation = citys[i][j];
        visited[i][j] = true;

        while (queue.length) {
          const [x, y] = queue.shift();
          for (let k = 0; k < 4; k++) {
            const [nx, ny] = [x + dx[k], y + dy[k]];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
              const diff = Math.abs(citys[x][y] - citys[nx][ny]);
              if (diff >= L && diff <= R && !visited[nx][ny]) {
                visited[nx][ny] = true;
                queue.push([nx, ny]);
                visitedRecord.push([nx, ny]);
                cnt++;
                sumPopulation += citys[nx][ny];
                flag = true;
              }
            }
          }
        }

        const changePopulation = Math.floor(sumPopulation / cnt);

        for (const [x, y] of visitedRecord) {
          citys[x][y] = changePopulation;
        }
      }
    }
  }

  if (!flag) break;
  ans += 1;
}
console.log(ans);

const input = [20, 7, 23, 19, 10, 15, 25, 8, 13];

const result = [];
const visited = Array(9).fill(false);

function dfs(depth, sum) {
  if (depth === 7) {
    if (sum <= 100) {
      for (let i = 0; i < 9; i++) {
        if (visited[i]) {
          result.push(input[i]);
        }
      }
    }
    return;
  }

  for (let i = 0; i < 9; i++) {
    if (visited[i]) continue;
    visited[i] = true;
    dfs(depth + 1, sum + input[i]);
    visited[i] = false;
  }
}

dfs(0, 0);

console.log(
  result
    .slice(0, 7)
    .sort((a, b) => a - b)
    .join('\n')
);

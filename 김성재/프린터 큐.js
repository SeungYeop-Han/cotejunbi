const input = ['3', '1 0', '5', '4 2', '1 2 3 4', '6 0', '1 1 9 1 1 1'];

let N = input[0];
let testCaseList = input
  .slice(1)
  .map((item) => item.split(' ').map((x) => Number(x)));
let answer = '';

for (let i = 0; i < testCaseList.length; i += 2) {
  // M 위츼의 문서 출력 순서
  let order = 0;
  const priorities = testCaseList[i + 1];
  // 처음 M 인덱스에 있던 수의 위치, 프린트 될 때 마다 변경
  let location = testCaseList[i][1];

  while (true) {
    const max = Math.max(...priorities);
    const number = priorities.shift();
    if (number === max) {
      order++;
      if (location === 0) {
        answer += order + '\n';
        break;
      }
    } else {
      priorities.push(number);
    }

    // 맨 앞이었을 경우 맨 뒤로 업데이트
    if (location === 0) {
      location = priorities.length - 1;
    } else {
      // 앞으로 한 칸 땡김
      location--;
    }
  }
}

console.log(answer.trim());

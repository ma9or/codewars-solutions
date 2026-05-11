function sortIt(arr) {
  // Создаем копию массива, чтобы не изменять оригинал
  let copy = arr.slice();
  
  // Используем reduce для подсчета частоты каждого элемента
  let frequency = arr.reduce((acc, num) => {
    // Если число уже есть в объекте, увеличиваем счетчик
    if (acc[num]) {
      acc[num]++;
    } else {
      // Если числа нет, добавляем его со значением 1
      acc[num] = 1;
    }
    return acc;
  }, {}); // Начинаем с пустого объекта
  
  // Сортируем копию массива
  copy.sort((a, b) => {
    // Если частоты разные
    if (frequency[a] !== frequency[b]) {
      // Меньшая частота идет первой (по возрастанию частоты)
      return frequency[a] - frequency[b];
    } else {
      // Если частоты одинаковые, сортируем по убыванию числа
      return b - a;
    }
  });
  
  return copy;
}
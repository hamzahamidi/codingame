function addDays(date, days) {
  const input = new Date(date);
  const output = input.setDate(input.getDate() + days);
  return new Date(output);
}

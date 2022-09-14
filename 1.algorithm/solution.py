import sys
print("Inverted pascal trangle\n")

inputArr = []
if (len(sys.argv) > 1):
    inputArr = [int(s) for s in sys.argv[1:]]
else:
    print("Please input numbers separate with space bar")
    inputStr = input("Enter array of numbers: ")
    inputArr = [int(s) for s in inputStr.split(" ")]


def invertedPascalTrangle(arr=inputArr):
    N = len(arr)
    if N < 2:
        print("Invalid input")
        return ""

    if N == 2:
        return "".join([str(n) for n in arr])

    sums = []
    for i in range(N - 1):
        sum = arr[i] + arr[i + 1]
        sums.append(sum % 10)

    return invertedPascalTrangle(sums)


result = invertedPascalTrangle()
print(result)

# mergeSort.py
import math
max = 10000000

def merge_sort(A, p, r):
	if p < r:
		q = math.floor((p + r) / 2)
		merge_sort(A, p, q)
		merge_sort(A, q + 1, r)
		merge(A, p, q, r)

def merge(A, p, q, r):
	L = A[p : q + 1]
	R = A[q + 1 : r + 1]
	L.append(max)
	R.append(max)
	i = 0
	j = 0
	for k in range(p, r + 1):
		if L[i] <= R[j]:
			A[k] = L[i]
			i = i + 1
		else:
			A[k] = R[j]
			j = j + 1
	L.pop()
	R.pop()
	print(p, q, r, L, '->', R, '->', A)

# A = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]
# A = [9, 7 ,5, 3, 1, 10, 8, 6, 4, 2]
A = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
merge_sort(A, 0, 9)
print(A)

# B = [9, 10, 7]
# merge(B, 0, 2, 3)
# print(B)
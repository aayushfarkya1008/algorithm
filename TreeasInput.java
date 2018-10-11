Scanner in=new Scanner(System.in);

		System.out.println("Enter Number of elements :");
		int n=in.nextInt();

		ArrayList<Integer>	A=new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++)
		{
			A.add(i,in.nextInt());
		}

		ListIterator ltr=A.listIterator();

		Node root=new Node(ltr.next());

		while()